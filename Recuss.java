package newTurtle;

public class Recuss {
    private static int innerSizeIncremental = 0;
    private static String result = "";
    private static int column = 0;
    private static int row = 0;

    public static String display2D(char [][] myChar){
        inner(myChar);
        result += "\n";
        column++;
        if ( column < myChar.length ){
            row = 0;
            display2D(myChar);
        };
        return result;
    }
    public static void inner(char [][] myChar){
        result += myChar[column][row] + " ";
        row++;
        if (row < myChar[column].length) {
            inner(myChar);
        }
    }
    public static String displayOneArray(char[] myChar){

        result += myChar[innerSizeIncremental];
        innerSizeIncremental++;
        if (innerSizeIncremental <myChar.length) displayOneArray(myChar);

        return result;
}

    public static void main(String[] args) {
        char[][] myChar = {{'O','X','O'},{'X','O','O'},{'X','O','X'}};

        System.out.println(display2D(myChar));
//        char [] chars = {'w','o','r','d','s'};
//        System.out.println(displayOneArray(chars));
    }
}
