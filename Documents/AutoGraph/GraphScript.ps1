#C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt
$bord1 = New-Object 'object[,]' 3,3
$Sott1 = New-Object 'object[,]' 3,3
$HZ1 = New-Object 'object[,]' 3,3
$FC1 = New-Object 'object[,]' 3,3
$bord2 = New-Object 'object[,]' 6,3
$Sott2 = New-Object 'object[,]' 6,3
$HZ2 = New-Object 'object[,]' 6,3
$FC2 = New-Object 'object[,]' 6,3
$j = 0
$k = 0
$l = 0
$m = 0
$s1 = "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt"
$s2 = "C:\Users\johna\csc496demo\5950x\Reference 6700XT\Benchmark.txt"
for ($scripn = 0; $scripn -lt 2; $scripn++) {
    

for ($i = 0; $i -lt (Get-Content $s1).Length;) {
    $a = (Get-Content $s1)[$i+1]
    $b = (Get-Content $s1)[$i+4]
    $c = (Get-Content $s1)[$i+5]
    $a = ($a) -replace "[^0.0-9.0]" , ''
    $b = ($b.substring(22)) -replace "[^0.0-9.0]" , ''
    $c = ($c.Substring(24)) -replace "[^0.0-9.0]" , ''

    if ((Get-Content $s1)[$i] -match "Borderlands3.exe") {
        Write-output "b"
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
        $bord1[$j,0] += $a
        $bord1[$j,1] += $b
        $bord1[$j,2] += $c
        }
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Reference 6700XT\Benchmark.txt") {
            $bord2[$j,0] += $a
            $bord2[$j,1] += $b
            $bord2[$j,2] += $c
            }

        $j++
    }

    if ((Get-Content $s1)[$i] -match "SOTTR.exe") {
        Write-output "s"
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
        $Sott1[$k,0] += $a
        $Sott1[$k,1] += $b
        $Sott1[$k,2] += $c
        }
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Reference 6700XT\Benchmark.txt") {
            $Sott2[$k,0] += $a
            $Sott2[$k,1] += $b
            $Sott2[$k,2] += $c
            }


        $k++
    }

    if ((Get-Content $s1)[$i] -match "HorizonZeroDawn.exe") {
        Write-output "h"
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
        $HZ1[$l,0] += $a
        $HZ1[$l,1] += $b
        $HZ1[$l,2] += $c
        }
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Reference 6700XT\Benchmark.txt") {
            $HZ2[$l,0] += $a
            $HZ2[$l,1] += $b
            $HZ2[$l,2] += $c
            }


        $l++

    }

    if ((Get-Content $s1)[$i] -match "FarCry5.exe") {
        Write-output "f"
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Sapphire 6700XT\Benchmark.txt") {
        $FC1[$m,0] += $a
        $FC1[$m,1] += $b
        $FC1[$m,2] += $c
        }
        if ($s1 -eq "C:\Users\johna\csc496demo\5950x\Reference 6700XT\Benchmark.txt") {
            $FC2[$m,0] += $a
            $FC2[$m,1] += $b
            $FC2[$m,2] += $c
            }


        $m++

    }
    

    $i = $i + 6
    if ($i -eq 24 -and $s1 -eq $s2) {
        $i = 25
    }
}
$s1 = $s2
$j = 0
$k = 0
$l = 0
$m = 0
Write-output $scripn
}

Write-output $bord1[2,2]
Write-output $bord2[2,2]
Write-output $FC2[2,2]
Write-output $FC1[2,2]


