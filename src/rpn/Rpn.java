/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.sanchez.utilities.RPN_Calculator;
/**
 *
 * @author Abel Sanchez
 */
public class Rpn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        RPN_Calculator rpn_calculator = new RPN_Calculator();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input;  

        System.out.println("Input: ");
        
        input = br.readLine();
        
        rpn_calculator.setClient_input(input);
        
        rpn_calculator.process_client_input();
        
        System.out.print(rpn_calculator.getRpn_stack());
        
        System.out.print(rpn_calculator.getError_message());
    }
    
}
