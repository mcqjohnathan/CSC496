$a = (Get-Content Output.txt)[0]
$b = (Get-Content Output.txt)[1]
$c = (Get-Content Output.txt)[2]
$d = (Get-Content Output.txt)[3]
$e = (Get-Content Output.txt)[4]
$f = $b.Substring($b.Length -1,1)
$g = $c.Substring($c.Length -1,1)


if (($f -match '\d') -and ($f -match '\d')) {
    Write-output 'Valid'
    Write-output $a
    Write-output $b
    Write-output $c
    Write-output $d
    Write-output $e
}else {
    Write-output 'InValid'
}
