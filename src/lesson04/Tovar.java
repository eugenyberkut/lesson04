package lesson04;

/**
 * Created by Eugeny on 01.06.2015.
 */
public class Tovar implements Comparable<Tovar> {
    private String tip;
    private String name;
    private Integer cost;
    private Integer minAge;
    private Integer maxAge;
    private Integer prim;

    public Tovar(String tip, String name, Integer cost, Integer minAge, Integer maxAge, Integer prim) {
        this.tip = tip;
        this.name = name;
        this.cost = cost;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.prim = prim;
    }

    public Tovar() {
        this("unkown","unkown",0,0,0,0);
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getPrim() {
        return prim;
    }

    public void setPrim(Integer prim) {
        this.prim = prim;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "tip='" + tip + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", prim=" + prim +
                '}';
    }


    /*
    определяет естественный порядок сортировки - в данном случае - по имени, а потом - по цене
     */
    @Override
    public int compareTo(Tovar o) {
        int result = name.compareTo(o.name);
//        int result = name.compareTo(o.getName());
        if (result==0) {
            result = cost - o.cost;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;

        Tovar tovar = (Tovar) o;

        if (tip != null ? !tip.equals(tovar.tip) : tovar.tip != null) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (cost != null ? !cost.equals(tovar.cost) : tovar.cost != null) return false;
        if (minAge != null ? !minAge.equals(tovar.minAge) : tovar.minAge != null) return false;
        if (maxAge != null ? !maxAge.equals(tovar.maxAge) : tovar.maxAge != null) return false;
        return !(prim != null ? !prim.equals(tovar.prim) : tovar.prim != null);

    }

    @Override
    public int hashCode() {
        int result = tip != null ? tip.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (minAge != null ? minAge.hashCode() : 0);
        result = 31 * result + (maxAge != null ? maxAge.hashCode() : 0);
        result = 31 * result + (prim != null ? prim.hashCode() : 0);
        return result;
    }
}
