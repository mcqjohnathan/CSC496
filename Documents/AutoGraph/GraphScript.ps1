#C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt
$bord1 = New-Object 'object[,]' 3,3
$Sott1 = New-Object 'object[,]' 3,3
$HZ1 = New-Object 'object[,]' 3,3
$FC1 = New-Object 'object[,]' 3,3
$bord2 = New-Object 'object[,]' 7,7
$Sott2 = New-Object 'object[,]' 7,7
$HZ2 = New-Object 'object[,]' 7,7
$FC2 = New-Object 'object[,]' 7,7
$j = 0
$k = 0
$l = 0
$m = 0
$s1 = "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt"
$s2 = "C:\Users\johna\csc496demo\5950x\Reference 6700XT\Benchmark.txt"
$games = ('Borderlands3','Sottr','HorizonZeroDawn','FarCry5')
$card = ("Sapphire", "Reference")
$res = ('4K stock','4K MAX','1440 stock','1440 MAX','1080 Stock','1080 MAX')
New-Item C:\Users\johna\CSC496\Documents\AutoGraph\temp.txt
$addres1 = "C:\Users\johna\CSC496\Documents\AutoGraph\temp.txt"
for ($i = 0; $i -lt 24; $i++) {
    
    if ($k -eq 6) {
        $k = 0
        $l++
    }
    for ($j = 0; $j -lt (Get-Content $s2).Length;) {
        
    if ((Get-Content $s2)[$j] -match $games[$l] -and (Get-Content $s2)[$j] -match $res[$k] ) {
        Add-Content $addres1 (Get-Content $s2)[$j]
        Add-Content $addres1 (Get-Content $s2)[$j+1]
        Add-Content $addres1 (Get-Content $s2)[$j+2]
        Add-Content $addres1 (Get-Content $s2)[$j+3]
        Add-Content $addres1 (Get-Content $s2)[$j+4]
        Add-Content $addres1 (Get-Content $s2)[$j+5]
    }
    $j++
    }
    $k++
}
$j=0
$l = 0
$k = 0
for ($scripn = 0; $scripn -lt 2; $scripn++) {
    

    for ($i = 0; $i -lt (Get-Content $s1).Length;) {
        $a = (Get-Content $s1)[$i+1]
        $b = (Get-Content $s1)[$i+4]
        $c = (Get-Content $s1)[$i+5]
        $a = ($a) -replace "[^0.0-9.0]" , ''
        $b = ($b.substring(22)) -replace "[^0.0-9.0]" , ''
        $c = ($c.Substring(24)) -replace "[^0.0-9.0]" , ''

        if ((Get-Content $s1)[$i] -match "Borderlands3.exe") {
            
            if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
            $bord1[$j,0] += $a
            $bord1[$j,1] += $b
            $bord1[$j,2] += $c
            }
            if ($s1 -eq $addres1) {
                $bord2[$j,0] += $a
                $bord2[$j,1] += $b
                $bord2[$j,2] += $c
                }

            $j++
        }

        if ((Get-Content $s1)[$i] -match "SOTTR.exe") {
            
            if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
            $Sott1[$k,0] += $a
            $Sott1[$k,1] += $b
            $Sott1[$k,2] += $c
            }
            if ($s1 -eq $addres1) {
                $Sott2[$k,0] += $a
                $Sott2[$k,1] += $b
                $Sott2[$k,2] += $c
                }


            $k++
        }

        if ((Get-Content $s1)[$i] -match "HorizonZeroDawn.exe") {
            
            if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
            $HZ1[$l,0] += $a
            $HZ1[$l,1] += $b
            $HZ1[$l,2] += $c
            }
            if ($s1 -eq $addres1) {
                $HZ2[$l,0] += $a
                $HZ2[$l,1] += $b
                $HZ2[$l,2] += $c
                }


            $l++

        }

        if ((Get-Content $s1)[$i] -match "FarCry5.exe") {
            
            if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
            $FC1[$m,0] += $a
            $FC1[$m,1] += $b
            $FC1[$m,2] += $c
            }
            if ($s1 -eq $addres1) {
                $FC2[$m,0] += $a
                $FC2[$m,1] += $b
                $FC2[$m,2] += $c
                }


            $m++

        }
        

        $i = $i + 6
        #if ($i -eq 24 -and $s1 -eq $s2) {
        #    $i = 25
        #}
    }
$s1 = $addres1
$j = 0
$k = 0
$l = 0
$m = 0

}
$pee = "gnuplot test1.txt"
$BScrip = "gnuplot BScrip.txt"
#New-Item C:\Users\johna\CSC496\Documents\AutoGraph\test14.txt
$addres = "C:\Users\johna\CSC496\Documents\AutoGraph\test14.txt"
$add3 = "C:\Users\johna\CSC496\Documents\AutoGraph\test1.txt"
$add4 = "C:\Users\johna\CSC496\Documents\AutoGraph\BScrip.txt"
$temp = $bord1
$place = 3 #keeps track of number of benchmarks run for each game
$counter = 0
for ($j = 0; $j -lt 8; $j++) {
    if ($j -eq 1) {
        $temp = $Sott1
    }
    if ($j -eq 2) {
        $temp = $HZ1
    }
    if ($j -eq 3) {
        $temp = $FC1
    }
    if ($j -eq 4) {
        $temp = $bord2
    }
    if ($j -eq 5) {
        $temp = $Sott2
    }
    if ($j -eq 6) {
        $temp = $HZ2
    }
    if ($j -eq 7) {
        $temp = $FC2
    }
    #if ($j -eq 4) {
       # $place = 6
    #}

    for ($i = 0; $i -lt $place; $i++) {
        $t = $temp[0,$i]
        $t2 = $temp[1,$i]
        $t3 = $temp[2,$i]
        $t4
        $t5
        $t6
        if ($j -ge 4) {
            $t4 = $temp[3,$i]
            $t5 = $temp[4,$i]
            $t6 = $temp[5,$i]
        }
        if ($i -eq 0 ) {
        
            Set-Content $addres "Average $t $t2 $t3 $t4 $t5 $t6"
        } 
        if ($i -eq 3 ) {
        
            Add-Content $addres "Average $t $t2 $t3 $t4 $t5 $t6"
        } 
        if ($i -eq 1 -or $i -eq 4) {
            Add-Content $addres "1% $t $t2 $t3 $t4 $t5 $t6"
        } 
        if ($i -eq 2 -or $i -eq 5) {
            Add-Content $addres "0.1% $t $t2 $t3 $t4 $t5 $t6"
        } 
        
    
    }
    
    #(Get-Content $add3 -raw) -replace 'Borderlands3',$games[$counter]
    #(Get-Content $add3).replace("Borderlands3",$games[$counter]) | Set-Content $add3
    #(Get-Content -Path $add3) |
    #ForEach-Object {$_.Replace("Borderlands3",$games[$counter])} |
    #    Set-Content -Path $add3
    
    #(Get-Content $add4 -raw) -replace 'Borderlands3',$games[$counter]
    $i =0
    

    if ($j -ge 4) {
        Invoke-Expression $BScrip
    }
    else {
        Invoke-Expression $pee
    }
    $counter = $counter +1
    if ($counter -le 3) {
        
        $add3 = "C:\Users\johna\CSC496\Documents\AutoGraph\test1.txt"
        $iniFile = $add3
        $find = $games[$counter-1]
        $replace = $games[$counter]
        (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
        $find = $games[$counter-1]+"Sapphire.png"
        $replace = $games[$counter]+"Sapphire.png"
        (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
    }
    else {
        
        $add4 = "C:\Users\johna\CSC496\Documents\AutoGraph\BScrip.txt"
        $iniFile = $add4
        $find = $games[($counter%4)-1]
        $replace = $games[$counter%4]
        (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
        $find = $games[($counter%4)-1]+"Reference.png"
        $replace = $games[$counter%4]+"Reference.png"
        (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
    }
    
    (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
    
    
}

$add3 = "C:\Users\johna\CSC496\Documents\AutoGraph\test1.txt"
        $iniFile = $add3
        $find = "FarCry5"
        $replace = "Borderlands3"
        (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
        $find = "FarCry5Sapphire.png"
        $replace = "Borderlands3Sapphire.png"
        (Get-Content $iniFile).Replace($find,$replace) |
    Set-Content $iniFile
    
    Remove-Item -Path "C:\Users\johna\CSC496\Documents\AutoGraph\temp.txt" -Force

#New-Item C:\Users\johna\CSC496\Documents\AutoGraph\test13.txt
#Set-Content C:\Users\johna\CSC496\Documents\AutoGraph\test12.txt '0 ' 
#Invoke-Expression gnuplot
#Invoke-Command set terminal dumb
#Invoke-Expression plot $bord1 using 1 title 'Borderlands3' with lines
