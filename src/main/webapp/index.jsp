<html>
<head>
<link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
<link rel="manifest" href="/site.webmanifest">
<link rel="mask-icon" href="/safari-pinned-tab.svg" color="#5bbad5">
<meta name="msapplication-TileColor" content="#da532c">
<meta name="theme-color" content="#ffffff">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles.css">
<script src="myjs.js"></script>
<title>Randomize!</title>
</head>
<body>
    <h2>Randomize!</h2>

      <form class = "centered">
              <table>
                <tr>
                  <td align="left" class = "styledText">Player One:</td>
                  <td align="left"><input type="text" class = "input" name="player0" id="name0" value="Meli4"></td>
                </tr>
                <tr>
                  <td align="left" class = "styledText">Player Two:</td>
                  <td align="left"><input type="text" class = "input"  name="player1" id="name1" value="Misha"></td>
                </tr>
                <tr>
                  <td align="left" class = "styledText">Player Three:</td>
                  <td align="left"><input type="text" class = "input"  name="player2" id="name2" value="Valeriy"></td>
                </tr>
                <tr>
                    <td align="left" class = "styledText">Player Four:</td>
                    <td align="left"><input type="text" class = "input"  name="player3" id="name3" value="Andrew"></td>
                </tr>
                <tr>
                    <td align="left" class = "styledText">Player Five:</td>
                    <td align="left"><input type="text" class = "input"  name="player4" id="name4" value="Oleg"></td>
                </tr>
                <tr>
                    <td align="left" class = "styledText">Player Six:</td>
                    <td align="left"><input type="text" class = "input"  name="player5" id="name5" value="Alex"></td>
                </tr>
              </table>
            </form>

      <div class="centered">
      <input type="checkbox" name="targ" id="house0" value="T" checked/>
      <img src="img/targ.png"/>
      <input type="checkbox" name="bara" id="house1" value="B" checked/>
      <img src="img/baratheon.png"/>
      <input type="checkbox" name="stark" id="house2"value="S" checked/>
      <img src="img/stark.png"/><br>
      <input type="checkbox" name="martel" id="house3" value="M" checked/>
      <img src="img/martel.png"/>
      <input type="checkbox" name="greyjoy" id="house4" value="G" checked/>
      <img src="img/greyjoy.png"/>
      <input type="checkbox" name="lannister" id="house5" value="L" checked/>
      <img src="img/lannister.png"/>
      </div>

      <div class = "centered">
      <button class="btn" onclick = "makeJson()">Randomize!!</button>
      </div>

     <form class = "centered">
       <table>
          <tr>
             <td align="left" id="pResult0" class = "styledText"></td>
             <td align="left" id="hResult0"></td>
             <td align="left" id="pResult1" class = "styledText"></td>
             <td align="left" id="hResult1"></td>
          </tr>
          <tr>
             <td align="left" id="pResult2" class = "styledText"></td>
             <td align="left" id="hResult2"></td>
             <td align="left" id="pResult3" class = "styledText"></td>
             <td align="left" id="hResult3"></td>
          </tr>
          <tr>
             <td align="left" id="pResult4" class = "styledText"></td>
             <td align="left" id="hResult4"></td>
             <td align="left" id="pResult5" class = "styledText"></td>
             <td align="left" id="hResult5"></td>
          </tr>
      </table>
     </form>
</body>
</html>
