$games = ('Borderlands3','Sottr','HorizonZeroDawn','FarCry5')
##https://raw.githubusercontent.com/mcqjohnathan/CSC496/master/Documents/AutoGraph/Borderlands3Reference.png
New-Item C:\Users\johna\CSC496\Documents\AutoGraph\outputConversion.txt
$add = "C:\Users\johna\CSC496\Documents\AutoGraph\outputConversion.txt"

##Set-Content $add ""
for ($i = 0; $i -lt 4; $i++) {
    $t=$games[$i]
    Add-Content $add "![Image of Benchmark](https://raw.githubusercontent.com/mcqjohnathan/CSC496/master/Documents/AutoGraph/$($t)Reference.png)"
    Add-Content $add "![Image of Benchmark](https://raw.githubusercontent.com/mcqjohnathan/CSC496/master/Documents/AutoGraph/$($t)Sapphire.png)"
}
##dIDNT KNOW IF YOU WANTED IT TO AUTOMATICLY APPLY THEM TO THE WEBSITE. THE WAY I READ THE ASSIGNMENT IT DIDNT SEEM LIKE U DID SO I PUT THE ANSEWS IN THE OUTPUT SCRIPT