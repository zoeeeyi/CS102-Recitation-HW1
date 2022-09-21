package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTestOut {
    protected static Rectangle m_rectangle;
    protected static BufferedReader m_in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        //Read length and width
        System.out.println("Please enter the length: ");
        String _lString = m_in.readLine();
        System.out.println("Please enter the width: ");
        String _wString = m_in.readLine();

        //Construct rectangle object
        int _l = Integer.parseInt(_lString);
        int _w = Integer.parseInt(_wString);
        m_rectangle = new Rectangle(_l, _w);

        //Do required stuff
        System.out.println("The area is: ");
        m_rectangle.printArea();
        System.out.println("Print area ten times: ");
        m_rectangle.printAreaTenTimes();
        if (m_rectangle.IsSquare()){
            System.out.println("It is a square!");
        } else {
            System.out.println("It's not a square!");
        }
    }
}
