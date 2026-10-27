class ConvertChar {
    public static char toUpperCase(char ch){ 
        if (ch>= 'a' && ch<= 'z')
            return (char) ('A' + (int) ch-(int) 'a');
        return ch;    
    }

    public static char toLowerCase(char ch){
        if (ch>= 'A' && ch<= 'Z')
            return (char) ('a' + (int) ch-(int) 'A');
        return ch;
    }
}
class TestConvertChar {
    public static void main(String[] args) {   
        System.out.println(ConvertChar.toUpperCase('c'));          
        System.out.println(ConvertChar.toLowerCase('C'));        
        System.out.println(ConvertChar.toUpperCase('h'));           
        System.out.println(ConvertChar.toLowerCase('H'));
    }
}
