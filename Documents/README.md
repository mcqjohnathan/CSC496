tats:
1070 Founders Edition
Intel Core i7-6700k
16GB Memory
ASROCK Z170 Gaming-ITX/ac
        My Computer is 4-5 years old.
        My first game was Gears 5. All i did was start the benchmark thats in the extras tab in the main menu
  then started MSI AfterBurner.When the benchmark ended i stopped the MSI program also and collected the data.
  My settings for gears 5 should be in the Gears5 file but they all are maxed out. My second game is Civilization 6.
  I ran the AI benchmark in the menu and collected my data that way.The settings were all maxed out with both
  performance and memory set to high. The third game i did was TotalwarSagaTroy i ran the game on high
  and did the battle benchmark then ran the game on medium and did the battle benchmrk also.

        I think the data shows that my computer can run these games at a good setting with optimal framerate.
  Troy used the most CPU out of all the games. But also had the highest framerate. On the gears5 MSI wasnt
  picking up the frametime for some reason. Putting troy on medium made the framerate go up by double.
  And the frametimes avg go up a bit. So running Troy on medium made it run 2 times faster than on ultra.

        Running Civ6 on powersave mode made it run .5 times worse. It actually took the benchmark 2x as long to
  complete than on High Performance mode. Also running at 1024*768 resolution made the frame rate shoot up by
  a little bit under double but it also got through the benchmark 2/3 the time it took it running 1080p.
  Making it the fastest out of the four.
        Powersave and High Performance were closer on gears 5 than i thought it wouldve been. High performance
 beating powersave by just a little bit better performance. Putting gears on 1325*720 resolution upped the
 frames by 20 and overall the game performed better in comparrsion to the normal gears 5 benchmark.
 Making it the better benchmark out of them all.
	Troy on Medium blew all the other bechmarks out of the water doubaling and even tripling there performance.
 Changing the resolution to 1152*720 boosted the overall performance by 30% id say. While between powersave 
 and high performance stayed around the same performance in this game with high performance just barly above 
 powersave.

 HW 2/17-2/24
        I used codes "awk -F',' '{print $10}' GearsBenchMSI| awk 'NR!=1 {print}'>Col1" to seperate the column i needed
 I did this for all four benchmarks making files Col1, Col2, Col3, Col4. I then used code
 (paste -d ',,,' Col1 Col2 Col3 Col4)>AllC to put them all in one file. I then made a graph script that
 is in each games files all 3 simuler to one another. Here is an example of one :
                        set title "Civ Framerate"
                        set xlabel "frame"
                        set ylabel "framerate"
                        set datafile separator ','
                        set terminal pngcairo size 800,600 enhanced font 'Segoe UI,10'
                        set output 'Civ6FR.png'
                        plot "Col1" using 1 title 'Civ6Bench1' with lines, \
                                "Col2" using 1 title 'Highperformance' with lines, \
                                "Co3" using 1 title 'PowerSave' with lines, \
                                "Col4" using 1 title 'Res1024*768' with lines
 The only real difference besides the file names is the gears one which is the first one i did that i
 combined all the columns with (paste -d ',,,' Col1 Col2 Col3 Col4)>AllC. I skipped this step for the other two games.
 Honestly you could skip the col step also i think. All script files are in the game files. i launched
 the script using load "script" command. All the graphs are in the game files.
	The graphs are intresting to see and look at the data. Some of the games the Benchmark finished quicker
 than other ones because they could do the turn order quicker when everything was set to lower resoultion.
 Or when it was on low power mode it took super long to go through all the turn order for the AI. 
 Seeing how low performance effected the framerate for all the games some more than others was intresting. 
 I feel like some games it was more sever on with others there was still a difference just not as big.
 I believe if youd have to order them they would all would be in the same order tho from greatest performance
 to the worst. 

