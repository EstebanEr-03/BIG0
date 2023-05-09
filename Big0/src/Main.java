import javax.sound.midi.Soundbank;
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazBusqueda PRIMER=new InterfazBusqueda();
                PRIMER.setVisible(true);
            }
        });






        /*   int[] nums1=new int[10000];
        int[] nums2=new int[100000];
        int[] nums3=new int[1000000];
        int[] nums4=new int[10000000];
        int[] nums5=new int[100000000];
        for (int i=0; i<10000; i++){
            nums1[i]=i;
        }
        for (int a=0; a<100000; a++){
            nums2[a]=a;
        }
        for (int b=0; b<1000000; b++){
            nums3[b]=b;
        }
        for (int c=0; c<10000000; c++){
            nums4[c]=c;
        }
        for (int d=0; d<100000000; d++){
            nums5[d]=d;
        }
        long tiempoInicioNums1=System.nanoTime();
        searchLineal(nums1,99999);
        long tiempoFinNums1=System.nanoTime();
        //System.out.println("TiempoFin1 "+tiempoFin);
        long tiempoTotalNums1=tiempoFinNums1-tiempoInicioNums1;
        System.out.println("el tiempo en buscar el numero 99999 es "+tiempoTotalNums1+"El numero que se encontro fue "+searchLineal(nums1,99999));
        long tiempoInicioSegundaBusquedaNums1=System.nanoTime();
        //System.out.println("tIEMPO INICIO SEG "+tiempoInicioSegundaBusqueda);
        searchBinary(nums1,99999);
        long tiempoFinSegundaBusquedaNums1=System.nanoTime();
        //System.out.println("TiempiFinSeg"+tiempoFinSegundaBusqueda);
        long tiempoTotalSegundaBusquedaNums1=tiempoFinSegundaBusquedaNums1-tiempoInicioSegundaBusquedaNums1;
        System.out.println("el tiempo en buscar de forma lineal es  "+tiempoTotalSegundaBusquedaNums1+" "+searchLineal(nums1,99999));
        if (tiempoTotalNums1>tiempoTotalSegundaBusquedaNums1){
            System.out.println("La busqueda mas rapida la realiza la busquedaBinaria");
        }else{
            System.out.println("La busqueda mas rapida la realiza la busquedaLineal");
        }
        System.out.println("************************************************************************************************************************************\n");
        long tiempoInicioNums2=System.nanoTime();
        searchLineal(nums2,999999);
        long tiempoFinNums2=System.nanoTime();
        //System.out.println("TiempoFin1 "+tiempoFin);
        long tiempoTotalNums2=tiempoFinNums2-tiempoInicioNums2;
        System.out.println("el tiempo en buscar el numero 999999 es "+tiempoTotalNums2+" "+searchBinary(nums2,999999));
        long tiempoInicioSegundaBusquedaNums2=System.nanoTime();
        //System.out.println("tIEMPO INICIO SEG "+tiempoInicioSegundaBusqueda);
        searchBinary(nums2,999999);
        long tiempoFinSegundaBusquedaNums2=System.nanoTime();
        //System.out.println("TiempiFinSeg"+tiempoFinSegundaBusqueda);
        long tiempoTotalSegundaBusquedaNums2=tiempoFinSegundaBusquedaNums2-tiempoInicioSegundaBusquedaNums2;
        System.out.println("el tiempo en buscar de forma lineal es  "+tiempoTotalSegundaBusquedaNums2+" "+searchLineal(nums2,999999));
        if (tiempoTotalNums2>tiempoTotalSegundaBusquedaNums2){
            System.out.println("La busqueda mas rapida la realiza la busquedaBinaria");
        }else{
            System.out.println("La busqueda mas rapida la realiza la busquedaLineal");
        }
        System.out.println("************************************************************************************************************************************\n");
        long tiempoInicioNums3=System.nanoTime();
        searchLineal(nums3,9999999);
        long tiempoFinNums3=System.nanoTime();
        //System.out.println("TiempoFin1 "+tiempoFin);
        long tiempoTotalNums3=tiempoFinNums3-tiempoInicioNums3;
        System.out.println("el tiempo en buscar el numero 9999999 es "+tiempoTotalNums3+" "+searchBinary(nums3,9999999));
        long tiempoInicioSegundaBusquedaNums3=System.nanoTime();
        //System.out.println("tIEMPO INICIO SEG "+tiempoInicioSegundaBusqueda);
        searchBinary(nums3,9999999);
        long tiempoFinSegundaBusquedaNums3=System.nanoTime();
        //System.out.println("TiempiFinSeg"+tiempoFinSegundaBusqueda);
        long tiempoTotalSegundaBusquedaNums3=tiempoFinSegundaBusquedaNums3-tiempoInicioSegundaBusquedaNums3;
        System.out.println("el tiempo en buscar de forma lineal es  "+tiempoTotalSegundaBusquedaNums3+" "+searchLineal(nums3,9999999));
        if (tiempoTotalNums3>tiempoTotalSegundaBusquedaNums3){
            System.out.println("La busqueda mas rapida la realiza la busquedaBinaria");
        }else{
            System.out.println("La busqueda mas rapida la realiza la busquedaLineal");
        }
        System.out.println("************************************************************************************************************************************\n");
        long tiempoInicioNums4=System.nanoTime();
        searchLineal(nums4,99999999);
        long tiempoFinNums4=System.nanoTime();
        //System.out.println("TiempoFin1 "+tiempoFin);
        long tiempoTotalNums4=tiempoFinNums4-tiempoInicioNums4;
        System.out.println("el tiempo en buscar el numero 99999999 es "+tiempoTotalNums4+" "+searchBinary(nums4,99999999));
        long tiempoInicioSegundaBusquedaNums4=System.nanoTime();
        //System.out.println("tIEMPO INICIO SEG "+tiempoInicioSegundaBusqueda);
        searchBinary(nums4,99999999);
        long tiempoFinSegundaBusquedaNums4=System.nanoTime();
        //System.out.println("TiempiFinSeg"+tiempoFinSegundaBusqueda);
        long tiempoTotalSegundaBusquedaNums4=tiempoFinSegundaBusquedaNums4-tiempoInicioSegundaBusquedaNums4;
        System.out.println("el tiempo en buscar de forma lineal es  "+tiempoTotalSegundaBusquedaNums4+" "+searchLineal(nums4,99999999));
        if (tiempoTotalNums4>tiempoTotalSegundaBusquedaNums4){
            System.out.println("La busqueda mas rapida la realiza la busquedaBinaria");
        }else{
            System.out.println("La busqueda mas rapida la realiza la busquedaLineal");
        }
        System.out.println("************************************************************************************************************************************\n");
        long tiempoInicioNums5=System.nanoTime();
        searchLineal(nums5,999999999);
        long tiempoFinNums5=System.nanoTime();
        //System.out.println("TiempoFin1 "+tiempoFin);
        long tiempoTotalNums5=tiempoFinNums5-tiempoInicioNums5;
        System.out.println("el tiempo en buscar el numero 999999999 es "+tiempoTotalNums5+" "+searchBinary(nums5,999999999));
        long tiempoInicioSegundaBusquedaNums5=System.nanoTime();
        //System.out.println("tIEMPO INICIO SEG "+tiempoInicioSegundaBusqueda);
        searchBinary(nums5,999999999);
        long tiempoFinSegundaBusquedaNums5=System.nanoTime();
        //System.out.println("TiempiFinSeg"+tiempoFinSegundaBusqueda);
        long tiempoTotalSegundaBusquedaNums5=tiempoFinSegundaBusquedaNums5-tiempoInicioSegundaBusquedaNums5;
        System.out.println("el tiempo en buscar de forma lineal es  "+tiempoTotalSegundaBusquedaNums5+" "+searchLineal(nums5,999999999));
        if (tiempoTotalNums5>tiempoTotalSegundaBusquedaNums5){
            System.out.println("La busqueda mas rapida la realiza la busquedaBinaria");
        }else{
            System.out.println("La busqueda mas rapida la realiza la busquedaLineal");
        } */

    }
    public static int searchBinary(int[] nums, int target) {
        //  int largo=nums.lenght;
        // System.out.println("el largo es"+largo);
        int izquierda=0, derecha= nums.length -1;
        while (izquierda<=derecha){
            int numMedio=(derecha+izquierda)/2;
            if(nums[numMedio]==target){
                return numMedio;
            }else if(nums[numMedio]<target){
                izquierda=numMedio+1;
            }else{
                derecha=numMedio-1;
            }
        }
        return-1;
    }
    public static int searchLineal(int[] nums, int target) {
        for (int j=0; j<nums.length; j++){
            if (nums[j]==target){
                return nums[j];
            }
        }
        return-1;
    }
}
