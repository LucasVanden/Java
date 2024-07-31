package com.example.primos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Primos {

        public void calcularPrimos(){
            List<Long> primos = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 5L, 7L, 11L));
                for (Long numeroATestear = 11L; true; numeroATestear=numeroATestear+2) {
                    long startTime = System.nanoTime();


                    boolean isPrimo = true;
                    for (int indexPrimo = 2; indexPrimo < primos.size(); indexPrimo++) {


                        if(numeroATestear % primos.get(indexPrimo) == 0){
                            isPrimo=false;
                            break;
                        }

                    }
                    if(isPrimo){
                        long endTime = System.nanoTime();
                       System.out.println(""+(endTime - startTime)+"-"+numeroATestear);
                        // log.info(""+(endTime - startTime)+"-"+numeroATestear);
                        primos.add(numeroATestear);
                    }
                    
                }
        }
}
