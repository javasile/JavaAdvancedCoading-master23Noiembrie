package comparatii;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String cnp;
    private String nume;
    private String prenume;
    private String adresa;

    public String getCnp() {
        return cnp;
    }

    public Employee setCnp(String cnp) {
        this.cnp = cnp;
        return this;
    }

    public String getNume() {
        return nume;
    }

    public Employee setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getPrenume() {
        return prenume;
    }

    public Employee setPrenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public String getAdresa() {
        return adresa;
    }

    public Employee setAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    /*
        returneaza
            -1 daca obiectul curent e considerat mai mic decat obiectul primit ca parametru
            0 daca obiectul curent e considerat pe acelasi nivel cu obiectul primit ca parametru
            1 daca obiectul curent e considerat mai mare decat obiectul primit ca parametru
     */
    @Override
    public int compareTo(Employee other) {
        /*
            ordonam dupa nume si prenume - compar numele si prenumele obiectului curent cu numele si prenumele obiectului primit ca parametru
         */
        String numeSiPrenume = (this.nume + this.prenume).toLowerCase();
        String otherNumeSiPrenume = (other.nume + other.prenume).toLowerCase();

//        return cnp.toLowerCase().compareTo(other.cnp.toLowerCase());
        return numeSiPrenume.compareTo(otherNumeSiPrenume);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {

        // daca se refera la aceeasi instanta (referintele sunt egale), atunci clar obiectele sunt si ele egale
        if (this == other) return true;

        // daca ajung aici, inseamna ca obiectul curent (this) e diferit de obiectul primit ca parametru, adica nu reprezinta aceeasi referinta

        // daca obiectul primit ca parametru este null sau nu este de tipul Employee, atunci comparatia nu mai are sens, returnez false (obiectele nu au cum sa fie egale)
        if (!(other instanceof Employee)) return false;

        // daca ajung aici, inseamna ca obiectul primit ca parametru este de tipul Employee, deci pot sa-i fac in siguranta cast la Employee
        Employee employee = (Employee) other;

        // daca cnp-ul obiectului curent este egal cu cnp-ul obiectului primit ca parametru, atunci consideram obiectele ca fiind egale
        // comparam cnp-urile fara sa deosebim litere mari de cele mici
        return cnp.equalsIgnoreCase(employee.cnp) && nume.toLowerCase().equals(employee.getNume().toLowerCase());
    }

    // campurile pe care le iau in considerare la equals trebuie sa le consider si in metoda hashcode
    // daca equals intre doua obiecte returneaza true, atunci metodele hashCode() ale celor doua obiecte trebuie sa returneze acelasi numar
    @Override
    public int hashCode() {
        return Objects.hash(cnp.toLowerCase() + nume.toLowerCase());
    }
}
