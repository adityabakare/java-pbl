import java.awt.*;
import java.applet.*;

public class rules extends Applet {
    
    public void paint(Graphics g) {
        
        g.drawString(">> Provide the correct Login ID as you will be prompted with it while user login.",55,70);
        g.drawString(">> Provide the correct details in the credentials required.",55,100);
        g.drawString(">> Once successfully registered, you will be able to access your account via the website.",55,130);
        g.drawString(">> Giving false bank/adhaar details may result in permanent account deactivation.",55,160);
        g.drawString(">> To open the farmers account:",55,190);
        g.drawString("a. You must be a resident Indian. ",80,220);
        g.drawString("b. Owing agricultural land or having income from agricultural resourses.",80,250);
        g.drawString(">> You must have a valid identity and address proof such as: ",55,280);
        g.drawString("a. Valid Passport",80,310);
        g.drawString("b. Voter ID card",80,340);
        g.drawString("c. PAN Card",80,370);
        g.drawString("d. Adhaar Card",80,400);
        g.drawString("e. Latest Passport size photographs",80,430);    
    
    }
}