

public class VAI {

	public static void imccalculo(double peso, double altura) {
		// TODO Auto-generated method stub
        
        double IMC;
        
        
        
        
            IMC = peso/Math.pow(altura, 2);
            
            if(IMC<17){
            	System.out.println("Ta esquelético");
            
            }
            if(IMC>17 && IMC<18.4){
            	System.out.println("Ta magro demais ainda");
            
            }
            if(IMC>18.5 && IMC<24.9){
            	System.out.println("Ta com um corpicho bom (:");
            
	}
            if(IMC>25 && IMC<29.9){
            	System.out.println("Ta meio gordinho ein..");
            
	}
            if(IMC>30){
            	System.out.println("VAI NA NUTRICIONISTA!");
            }

            
            if(IMC<18.5){
            	System.out.println("Ta esquelética");

            }else if(IMC>18.6 && IMC<24.9){
            	System.out.println("Ta magra demais ainda");
            
            }else if(IMC>25 && IMC<29.9){
            	System.out.println("Ta com um corpicho bom (:");
            
            }else if(IMC>30)
            	System.out.println("Ta meio gordinha ein..Precisa dar uma passada no nutricionista");
           
	}


            
          
	}

            
            
	

