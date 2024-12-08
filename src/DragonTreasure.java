
public class DragonTreasure {

    public static void main(String[] args) {
        //FIXME should start the game when run


        Door[] doors =
            {
                new Door('n'),
                new Door('e'),
                new Door('s'),
                new Door('w')
            };

        Room test = new Room("test", doors);
        test.doNarrative();
    }//main

    public DragonTreasure()
    {
        //TODO implement constructor
    }

    public void setupGame()
    {
        //TODO implementation
    }

    public void endGame()
    {
        //TODO implementation
    }

    private void printTreasure() {
        System.out.println(
                "                  _.--.\n" +
                        "              _.-'_:-'||\n" +
                        "          _.-'_.-::::'||\n" +
                        "     _.-:'_.-::::::'  ||\n" +
                        "   .'`-.-:::::::'     ||\n" +
                        "  /.'`;|:::::::'      ||_\n" +
                        " ||   ||::::::'      _.;._'-._\n" +
                        " ||   ||:::::'   _.-!oo @.!-._'-.\n" +
                        " \'.  ||:::::.-!() oo @!()@.-'_.||\n" +
                        "   '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n" +
                        "     `>'-.!@%()@'@_%-'_.-o _.|'||\n" +
                        "      ||-._'-.@.-'_.-' _.-o  |'||\n" +
                        "      ||=[ '-._.-\\U/.-'    o |'||\n" +
                        "      || '-.]=|| |'|      o  |'||\n" +
                        "      ||      || |'|        _| ';\n" +
                        "      ||      || |'|    _.-'_.-'\n" +
                        "      |'-._   || |'|_.-'_.-'\n" +
                        "      '-._'-.|| |' `_.-'\n" +
                        "           '-.||_/.-'\n");
    }

    public void printDragon() {
        System.out.println(
                "                                                  .~))>>\n" +
                        "                                                 .~)>>\n" +
                        "                                               .~))))>>>\n" +
                        "                                             .~))>>             ___\n" +
                        "                                           .~))>>)))>>      .-~))>>\n" +
                        "                                         .~)))))>>       .-~))>>)>\n" +
                        "                                       .~)))>>))))>>  .-~)>>)>\n" +
                        "                   )                 .~))>>))))>>  .-~)))))>>)>\n" +
                        "                ( )@@*)             //)>))))))  .-~))))>>)>\n" +
                        "              ).@(@@               //))>>))) .-~))>>)))))>>)>\n" +
                        "            (( @.@).              //))))) .-~)>>)))))>>)>\n" +
                        "          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\n" +
                        "       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\n" +
                        "      )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>\n" +
                        "    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\n" +
                        "     )* @@@ )@*     (@)  (@) /\\b|))) //))))))>>))))>>\n" +
                        "   (( @. )@( @ .   _/  /    /  \\b)) //))>>)))))>>>_._\n" +
                        "    )@@ (@@*)@@.  (6///6)- / ^  \\b)//))))))>>)))>>   ~~-.\n" +
                        " ( @jgs@@. @@@.*@_ VvvvvV//  ^  \\b/)>>))))>>      _.     `bb\n" +
                        " ((@@ @@@*.(@@ . - | o |' \\ (  ^   \\b)))>>        .'       b`,\n" +
                        "   ((@@).*@@ )@ )   \\^^^/  ((   ^  ~)_        \\  /           b `,\n" +
                        "     (@@. (@@ ).     `-'   (((   ^    `\\ \\ \\ \\ \\|             b  `.\n" +
                        "       (*.@*              / ((((        \\| | |  \\       .       b `.\n" +
                        "                         / / (((((  \\    \\ /  _.-~\\     Y,      b  ;\n" +
                        "                        / / / (((((( \\    \\.-~   _.`\" _.-~`,    b  ;\n" +
                        "                       /   /   `(((((()    )    (((((~      `,  b  ;\n" +
                        "                     _/  _/      `\"\"\"/   /'                  ; b   ;\n" +
                        "                 _.-~_.-~           /  /'                _.'~bb _.'\n" +
                        "               ((((~~              / /'              _.'~bb.--~\n" +
                        "                                  ((((          __.-~bb.-~\n" +
                        "                                              .'  b .~~\n" +
                        "                                              :bb ,' \n" +
                        "                                              ~~~~\n");
    }
}//class