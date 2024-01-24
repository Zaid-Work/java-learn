import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // This is a comment
        char ch = 'a';
        String s = "Abc";
        String s_small = s.toLowerCase();
        System.out.println(s);
        System.out.println(s_small);
        Date date = new Date();
        System.out.println(date);
        byte myByte = -128;
        short theShort = 8383;
        int theInteger = 83873;
        long theLong = 218282;
        float theFloat = 2.28F;
        double theDouble = 9.3993;
        boolean isAdult = false;
        char name_initial = 'B';
        System.out.println(myByte);
        System.out.println(theShort);
        System.out.println(theInteger);
        System.out.println(theFloat);
        System.out.println(theLong);

//        System.out.println("Hello");

        //Non primitive data types
        String name = new String("Hello");
        for(int i = 0;i < name.length(); i++)
            System.out.print(name.charAt(i) + "|");
        System.out.println();
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a is " + a + " - b is " + b);

        Person alex = new Person("alex");
        Person zaid = alex;
        //(deep copy)

        //before changing
        System.out.println(alex.name + " " + zaid.name);

        alex.name = "Changed name";

        // after changing
        System.out.println(alex.name + " " + zaid.name);
        int subscriberCount = 1;
        //camel case

        //char a = 'Aa'(wrong)

        String name_new = "new name yayayayyay";
        System.out.println(name_new.toUpperCase());

        System.out.println(name_new.charAt(0));
        System.out.println(name_new.getBytes(StandardCharsets.UTF_8));

        System.out.println(name_new.contains("name"));

        LocalDateTime localDateTime = LocalDateTime.now();
//        ArrayList<Integer>arr;

        //reserved keyword -> not used as identifier
        int ten = 10;
        int two = 2;
        System.out.println(ten+two);
        System.out.println(ten-two);
        System.out.println(ten/two);
        System.out.println(ten*two);
        System.out.println(ten%two);

        System.out.println(Math.abs(-19));
        System.out.println(Math.max(3.2,23.27));
        System.out.println(Math.min(28,32));
        System.out.println((int)Math.pow(2,3));
        System.out.println(Math.sqrt(839));
        System.out.println(Math.PI);

        int myAge = 19;
        int yourAge = 20;
        boolean isGreater = (myAge > yourAge);
        System.out.println(isGreater);

        if(myAge==yourAge){
            System.out.println("hello");
        }
        else{
            System.out.println("bye");
        }

        boolean isMe = false;
        boolean isStudent = true;
        System.out.println(isMe && isStudent);
        System.out.println(isMe || isStudent);
        System.out.println(10>8 || 2<3 && true);

//        while(true){
//
//        }

        String message = myAge>18?"hello":"bye";
        System.out.println(message);

        String gender = "FEMALE";
        switch(gender){
            case "MALE":
                break;
            default:
                System.out.println("yayyy");
        }

        int [] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 0;
        numbers[2] = 10;
        numbers[1] = 33;

        System.out.println(Arrays.toString(numbers));

        int [] numbersCustom = {2,0,1};
        for(int ele : numbersCustom){
            System.out.println(ele);
        }

        //last
        System.out.println(numbersCustom[numbersCustom.length-1]);

        Arrays.stream(numbers).forEach(System.out::println);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is name");
//        String userName = scanner.nextLine();
//        System.out.println("Hello" + userName);
//        System.out.println("How old are you");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("You were born in " + year);

        char [] letters = {'a','b','c'};
        System.out.println(countOccurences('a',letters));

        Lens obj = new Lens("Sony", "23mm", false);
        System.out.println(obj);
        System.out.println(obj.brand);
        System.out.println(obj.focalLength);
        System.out.println(obj.isPrime);

    }

    public static int countOccurences(char ch, char [] letters){
        int ans = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i] == ch){
                ans++;
            }
        }
        return ans;
    }

    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,String focalLength,boolean isPrime){
            this.brand =brand;
            this.focalLength =focalLength;
            this.isPrime =isPrime;
        }
    }
    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }
    }
}