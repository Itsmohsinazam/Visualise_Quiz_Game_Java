package self_learning;
//import java.util.Scanner; //  'java.util.Scanner' class is a versatile input parsing tool  
import javax.swing.JOptionPane;

public class visual_quiz_game {     
	public static void main(String[] args) {  

       // Inserting questions, options and answers         
		String[] questions = {                 
				"What is the capital of France?\n" +                         
						"a) Sydney\n" +                         
						"b) Islamabad\n" +                         
						"c) Canberra\n" +                         
						"d) Paris", 
		
                "What is the largest mammal in the world?\n" +                         
                		"\n"+  
                		"a) Elephant\n" +                         
                		"b) Blue Whale\n" +                         
                		"c) Giraffe\n" +                         
                		"d) Gorilla",                 
                		
                "What is the capital city of Australia?\n" +                         
                		"a) Sydney\n" +                         
                		"b) Melbourne\n" +                         
                		"c) Canberra\n" +                         
                		"d) Brisbane",                 
                		
                "What is the capital of Pakistan?\n" +                         
                		"a) Islamabad\n" +                         
                		"b) Kabul\n" +                         
                		"c) Canberra\n" +                         
                		"d) Brisbane",                 
                		
                "What is the capital city of Japan?\n" +                         
                		"\n" +                         
                		"a) Beijing\n" +                         
                		"b) Tokyo\n" +                         
                		"c) Seoul\n" +                         
                		"d) Bangkok"         
        };  
        // Correct answers         
		String[] correctAnswers = {                 
				"D",                 
				"B",                 
				"C",                 
				"A",                 
				"B"         
		}; 
		
        // Quiz logic         
		double score = 0;  
        for (int i = 0; i < questions.length; i++) {             
        	System.out.println(); 
        	String Response = JOptionPane.showInputDialog("Question " + (i + 1) + ": " + questions[i]+"\n"+"Your answer: ");            
        	
        // Check if the answer is correct             
        if (Response.equalsIgnoreCase(correctAnswers[i])) {                 
        	JOptionPane.showMessageDialog(null,"Correct!");
        	score++;             
        } 
        else {                 
        	JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is: " + correctAnswers[i]);
        }             
        System.out.println(); 
        }
        
        // Calculate and display the percentage         
        double percentage = ((double) score / questions.length * 100); 
         
        // Calculate and display the final score 
        if(score<3) {
        	JOptionPane.showMessageDialog(null,"Quiz completed!"+"\n"+
        										"Your final score is: " + score + "/" + questions.length+"\n"+
        										"Percentage: " + percentage + "%"+"\n"+
        										"Well tried! Better luck next time");
        }
        else if(score==5) {
        	JOptionPane.showMessageDialog(null,"Quiz completed!"+"\n"+
        										"Your final score is: " + score + "/" + questions.length+"\n"+
        										"Percentage: " + percentage + "%"+"\n"+
        										"You have done an amazing job!");
        }
        else {
        	JOptionPane.showMessageDialog(null,"Quiz completed!"+"\n"+
        										"Your final score is: " + score + "/" + questions.length+"\n"+
        										"Percentage: " + percentage + "%"+"\n"+
        										"Well tried! Need nore efforts");
        }
                  
        // Quiz Ended
        } 
	} 