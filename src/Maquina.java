public class Maquina {
  public int agua;
  private int granoscafe;
  public int crema;
  public int vasos;

    public Maquina(int agua, int granoscafe, int crema, int vasos) {
        this.agua = agua;
        this.granoscafe = granoscafe;
        this.crema = crema;
        this.vasos = vasos;
    }
    public Maquina(){
      agua = 5000;
      granoscafe = 1000;
      crema = 1500;
      vasos = 50;
  }

  public void Americano(){
      if ( agua >= 120 && granoscafe >= 20 ){
          agua -= 180;
          granoscafe -=15;
          vasos -=1;
          System.out.println("Retire su Cafe");
      }else {
          System.out.println("No fue posible servir su cafe ");
      }

  }
  public void expreso(){
        if ( agua  >= 120 && granoscafe >= 20 ){
            agua -= 120;
            granoscafe -=20;
            vasos -=1;
            System.out.println("Retire su Cafe");
        }else {
            System.out.println("No fue posible servir su cafe ");
        }

  }
  public void capuchino(){
        if ( agua >= 120 && granoscafe >= 20 && crema >=70 ){
          agua -= 120;
          granoscafe -=20;
          crema -= 70;
          vasos -=1;
          System.out.println("Retire su Cafe");
      }else {
          System.out.println("No fue posible servir su cafe ");
      }
  }
  public void ingrendietes(){
      System.out.println("La maquina tiene : ");
      System.out.println("Agua: " + agua );
      System.out.println("Cafe:" + granoscafe);
      System.out.println("Crema " + crema);
      System.out.println(" Vasos " + vasos);
  }
}
