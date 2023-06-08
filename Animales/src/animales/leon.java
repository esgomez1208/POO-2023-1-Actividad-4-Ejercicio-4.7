package animales;

public class leon extends felino {
    
    @Override
      public String getSonido() {
        return "Rugido";
}

    @Override
    public String getAlimentos() {
        return "Carnivoro";
}  
    
    public String getHabitat(){
        return "Praderas";
    }
    @Override
    public String getNombreCientífico() {
        return "Panthera leo";
    
    }
}
