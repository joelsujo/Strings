import java.util.*;

class String_Aerobics{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        
        while(repeat){
            int vowelCount = 0;
            System.out.println("Please type any sentence of your choosing: ");
            String testInput = input.nextLine().toLowerCase();
            String testInputVowels = "";
    
            for(char i: testInput.toCharArray()){
                switch(i){
                    case 'a':
                    case 'A':   vowelCount++; testInputVowels += i;
                    break;
                    case 'e':
                    case 'E':   vowelCount++; testInputVowels += i;
                    break;
                    case 'i':
                    case 'I':   vowelCount++; testInputVowels += i;
                    break;
                    case 'o':
                    case 'O':   vowelCount++; testInputVowels += i;
                    break;
                    case 'u':
                    case 'U':   vowelCount++; testInputVowels += i;
                    break;
                    default:
                }
            }
            testInput = testInput.trim();
            if(testInput.equalsIgnoreCase("Stop")) break;
            System.out.println("Your statement: " + testInput);
            System.out.println("# of vowels: " + vowelCount);
            System.out.println("Your vowels: " + testInputVowels.toUpperCase());
        }
        input.close();
    }
}