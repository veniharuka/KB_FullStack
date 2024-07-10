package afterStudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PhoneNumberList {
    public static boolean main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] phone_book = new String[]{br.readLine()};
        boolean answer = false;




        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            String temp=phone_book[i+1].substring(0,phone_book[i].length());

            if(temp.equals(phone_book[i])){
                return false;
            }
        }



        return true;
    }






}
