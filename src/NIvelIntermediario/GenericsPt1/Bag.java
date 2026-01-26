package NIvelIntermediario.GenericsPt1;


import java.util.ArrayList;
import java.util.List;

public class Bag<T>{
    private List<T> equipamentos= new ArrayList<>();

    public Bag() {
        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return equipamentos.toString();
    }

    public void adicionarEquipamento(T equipamento){
        equipamentos.add(equipamento);
    }
}
