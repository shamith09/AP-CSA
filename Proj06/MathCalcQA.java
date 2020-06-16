
/**
 * Write a description of class x here.
 * 
 * @author A. Nguyen 
 * @version 1.0
 */
public class MathCalcQA
{
    
    public static void main (String[] args)
    {
        int run = 1;
        int mxRun = 2;
        
        MathCalculations aCalc = new MathCalculations();
            
        int loInt = 0;
        int hiInt = 0;
        
        System.out.println("cToFDeg:");
        int cDeg = 0;
        int fDeg = 0;
        loInt = -10;
        hiInt = 59;
        run = 1;
        System.out.println("\t C degrees\t F degrees");
        while (run <= mxRun) 
        {
            cDeg = (int) (Math.random() * (hiInt - loInt + 1)) + loInt;
            if (cDeg % 5 != 0) {
                fDeg = aCalc.cToFDeg(cDeg);
                System.out.printf("\t %3d \t\t %3d \n", cDeg, fDeg);
                run++;
            }
        }
        cDeg = (hiInt + loInt)/2;
        fDeg = aCalc.cToFDeg(cDeg);
        System.out.printf("\t %3d \t\t %3d \n", cDeg, fDeg);
        
        
        System.out.println("distanceFormula:");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double dist = 0.0;
        int loIntX = -15;
        int hiIntX = -1;
        int loIntY = 0;
        int hiIntY = 15;
        run = 1;
        System.out.println("\t x1 \t\t y1 \t\t x2 \t\t y2 \t\t Distance");
        while (run <= mxRun) 
        {
            x1 = (int) (Math.random() * (hiIntX - loIntX + 1)) + loIntX;
            y1 = (int) (Math.random() * (hiIntY - loIntY + 1)) + loIntY;
            x2 = (int) (Math.random() * (hiIntX - loIntX + 1)) + loIntX;
            y2 = (int) (Math.random() * (hiIntY - loIntY + 1)) + loIntY;
            dist = aCalc.distanceFormula(x1, y1, x2, y2);
            System.out.printf("\t %6.2f \t %6.2f \t %6.2f \t %6.2f \t %6.2f \n",
                                x1, y1, x2, y2, dist);
            run++;
        }
        x1 = (hiIntX + loIntX) / 3.0;
        y1 = (hiIntY + loIntY) / 3.0;;
        x2 = 2.0 * (hiIntX + loIntX) / 3.0;
        y2 = 2.0 * (hiIntY + loIntY) / 3.0;
        dist = aCalc.distanceFormula(x1, y1, x2, y2);
        System.out.printf("\t %6.2f \t %6.2f \t %6.2f \t %6.2f \t %6.2f \n",
                                x1, y1, x2, y2, dist);
                                
                                

        System.out.println("volOfSphere:");
        double radius = 0;
        double vol = 0.0;
        loInt = 0;
        hiInt = 20;
        run = 1;
        System.out.println("\t Radius \t Volume of sphere");
        while (run <= mxRun) 
        {
            radius = (Math.random() * (hiInt - loInt + 1)) + loInt;
            vol = aCalc.volOfSphere(radius);
            System.out.printf("\t %6.2f \t\t %6.2f \n", radius, vol);
            run++;
        }
        radius = (hiInt + loInt) / 2.0;
        vol = aCalc.volOfSphere(radius);
        System.out.printf("\t %6.2f \t\t %6.2f \n", radius, vol);
            
        
        System.out.println("approxE:");
        int n = 0;
        double apprE = 0.0;
        loInt = 5001;
        hiInt = 7000;
        mxRun = 3;
        run = 1;
        System.out.println("\t n \t\t Approximated e");
        while (run <= mxRun) 
        {
            n = (int)(Math.random() * (hiInt - loInt + 1)) + loInt;
            apprE = aCalc.approxE(n);
            System.out.printf("\t %6d \t\t %8.6f \n", n, apprE);
            run++;
        }
        
        
        
        System.out.println("timeConverter:");
        int secs = 0;
        String hhmmss = "hh:mm:ss";
        loInt = 1;
        hiInt = 45200;
        run = 1;
        mxRun = 4;
        System.out.println("\t Total secs \t hh:mm:ss");
        while (run <= mxRun) 
        {
            secs = (int)(Math.random() * (hiInt - loInt + 1)) + loInt;
            hhmmss = aCalc.timeConverter(secs);
            System.out.printf("\t %6d", secs);
            System.out.println("\t\t " + hhmmss);
            run++;
        }
        secs = (hiInt + loInt) / 2;
        hhmmss = aCalc.timeConverter(secs);
        System.out.printf("\t %6d", secs);
        System.out.println("\t\t " + hhmmss);
    }
}
