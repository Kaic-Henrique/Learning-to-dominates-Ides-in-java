package Learning.model;

import java.util.Objects;

public class Estudante {
    private String Name;
    private Integer Yea;
    private String Gener;

        public Estudante() {}

    public Estudante(String name, Integer yea, String gener) {
        Name = name;
        Yea = yea;
        Gener = gener;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getYea() {
        return Yea;
    }

    public void setYea(Integer yea) {
        Yea = yea;
    }

    public String getGener() {
        return Gener;
    }

    public void setGener(String gener) {
        Gener = gener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(Name, estudante.Name) && Objects.equals(Yea, estudante.Yea) && Objects.equals(Gener, estudante.Gener);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Yea, Gener);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "Name='" + Name + '\'' +
                ", Yea=" + Yea +
                ", Gener='" + Gener + '\'' +
                '}';
    }
}
