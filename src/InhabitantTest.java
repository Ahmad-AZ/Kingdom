import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class InhabitantTest {

    @Test
    public void Inhabitant(){

        // Create Object sucess

        int income = 10;


        try {
            Modifier.isAbstract(Inhabitant.class.getModifiers());
        }
        catch (Exception exception){

            System.out.println(Inhabitant.class.getClass()+"class must be abstract");
        }




    }



}
