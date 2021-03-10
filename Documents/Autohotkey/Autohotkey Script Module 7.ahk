^j::
Run, D:\Cinebench\Cinebench.exe
Sleep, 10000
Click, 340 160 0
Sleep, 2000
Click
Sleep, 810000
Click, 347 200 0
Sleep, 500
Click
Sleep, 950000
Send, {LWin down}{PrintScreen down}{LWin up}{PrintScreen up}
Sleep, 2000
Click, 301 171 0
Click, Down Right
Sleep, 4000
Click, Up Right
Sleep, 4000
Click, 311 177 0
Sleep, 1000
Click, Down
Sleep, 500
Click, Up
Sleep, 4000
multiC:=clipboard
Sleep, 4000
Click, 293 201 0
Click, Down Right
Sleep, 4000
Click, Up Right
Sleep, 4000
Click, 318 214 0
Sleep, 1000
Click, Down
Sleep, 500
Click, Up
Sleep, 4000
SC:=clipboard
space_loc := instr(multiC, a_space)
multiC := SubStr(multiC, 1 , space_loc-1)
Sleep, 4000
space_loc := instr(SC, a_space)
SC := SubStr(SC, 1 , space_loc-1)
Sleep, 4000
EC:= multiC/4
Sleep, 4000
Click, 203 308 0
Click, Down Right
Sleep, 4000
Click, Up Right
Sleep, 4000
Click, 229 316 0
Sleep, 1000
Click, Down
Sleep, 500
Click, Up
Sleep, 4000
pros:=clipboard
Click, 165 337 0
Click, Down Right
Sleep, 4000
Click, Up Right
Sleep, 4000
Click, 192 348 0
Sleep, 1000
Click, Down
Sleep, 500
Click, Up
Sleep, 4000
core:=clipboard
FileAppend, %pros%`n`Cinebench R23 Multi core Score: %multiC%`n`Cinebench R23 Single core Score: %SC%`n`Number of Cores in This Machine: %core%`n`Cinebench R23 Estimated Single Core: %EC%`n, %A_WorkingDir%\Output.txt
return