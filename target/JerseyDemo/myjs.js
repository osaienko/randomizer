const HttpClient = function() {
    this.get = function(aUrl, aCallback) {
        var anHttpRequest = new XMLHttpRequest();
        anHttpRequest.onreadystatechange = function() {
            if (anHttpRequest.readyState == 4 && anHttpRequest.status == 200)
                aCallback(anHttpRequest.responseText);
        }

        anHttpRequest.open( "GET", aUrl, true );
        anHttpRequest.send( null );
    }

    this.post = function (aUrl, aBody, aCallback) {
                 var anHttpRequest = new XMLHttpRequest();
                 anHttpRequest.onreadystatechange = function() {
                 anHttpRequest.setRequestHeader('Content-type','application/json; charset=utf-8');
                     if (anHttpRequest.readyState == 4 && anHttpRequest.status == 200)
                         aCallback(anHttpRequest.responseText);
                 }

                 anHttpRequest.open( "POST", aUrl, true );
                 anHttpRequest.send( aBody );
         }
}

function myFunction() {
  const client = new HttpClient();
  client.get('http://localhost:8080/webapi/myresource/time', function(response) {


    var json = JSON.parse(response);

    document.getElementById("timeField").innerHTML = json.time;
    document.getElementById("dateField").innerHTML = json.date;

  });



}

function makeJson() {
  var houses = new Array(5);
  var players = new Array(5);

  var valid = validateAmount();
  if (!valid['status']) {
      alert (valid['message']);
      return;
  }

  for (i=0;i<6;i++) {
      if(isChecked("house"+i)) {
          houses[i] = document.getElementById("house"+i).value;
      }
      else {houses[i] = "empty";}

      if(!isEmptyField("name"+i)) {
                players[i] = document.getElementById("name"+i).value;
            }
            else {players[i] = "empty";}
  }



  var playersMap = {
    "houses": houses,
    "players": players
  }
  var json = JSON.stringify(playersMap);

    var xhr = new XMLHttpRequest();
    xhr.open("POST", 'https://gotrandom.herokuapp.com/webapi/myresource/randomize', true);
    xhr.setRequestHeader('Content-type','application/json; charset=utf-8');
    xhr.onload = function () {
    	var j = JSON.parse(xhr.responseText);
    	var houses = j['houses'];
    	var players = j['players'];

      clearResults();

      for (i = 0; i < players.length; i++) {
                var newP = document.createElement("P");
                newP.appendChild(document.createTextNode(players[i]));
                appendChildByID("pResult" + i, newP)
                var newImg = document.createElement("IMG");
                newImg.id = "iResult"+i;
                appendChildByID("hResult" + i, newImg)
                document.getElementById("iResult"+i).src = whichImage(houses[i]);
      }
      window.scrollTo(0,document.body.scrollHeight);
    }
    xhr.send(json);


}

function isChecked (ID) {
if (document.getElementById(ID).checked)
  return true;
  else return false;
}

function isEmptyField (ID) {
    if (!document.getElementById(ID).value) {
      return true;
    } else return false;

}

function validateAmount() {
var message;
var status;
var counterHouses = 6;
var counterPlayers = 6;
for (i=0;i<6;i++) {
      if(!isChecked("house"+i)) {
          counterHouses--;
      }

      if(isEmptyField("name"+i)) {
          counterPlayers--;
      }
   }

   if (counterPlayers<2 || counterHouses<2) {
        message = "Please check more than 1 house/enter more than one player.";
        status = false;
   } else if (counterPlayers != counterHouses) {
        message = "Amount of players and houses should be equal!";
        status = false;
   } else {
        message = "No errors!";
        status = true;
   }

return {"status": status, "message": message};

}

function appendChildByID(ID, child) {
    document.getElementById(ID).appendChild(child);
}

function whichImage (str) {
    switch(str) {
        case "B":
            return "img/baratheon.png";
            break;
        case "T":
            return "img/targ.png";
            break;
        case "S":
            return "img/stark.png";
            break;
        case "M":
            return "img/martel.png";
            break;
        case "G":
            return "img/greyjoy.png";
            break;
        case "L":
           return "img/lannister.png";
            break;
    }
}

function clearResults() {
      for (i = 0; i < 6; i++) {
                var player = document.getElementById("pResult" + i);
                var house = document.getElementById("hResult" + i);
                while (player.firstChild) {
                    player.removeChild(player.firstChild);
                }
                while (house.firstChild) {
                    house.removeChild(house.firstChild);
                }
      }
}