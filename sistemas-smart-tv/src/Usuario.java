public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmarTV smarTv = new SmarTV();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        smarTv.mudarCanal(13);
        
        System.out.println("Canal Atual ?" + smarTv.canal);
        System.out.println("Volume Atual: " + smarTv.volume);
        System.out.println("TV Ligada ?" + smarTv.ligada);
        System.out.println("Volume Atual ? " + smarTv.volume);






    }
}
