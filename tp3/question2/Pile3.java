package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;

    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
    if(taille<=0)
        taille=CAPACITE_PAR_DEFAUT;
    v.setSize(taille);
    }

    public void empiler(Object o) throws PilePleineException {
        if(this.estPleine())
           throw new PilePleineException() ;
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        if(this.estVide())
            throw new PileVideException();
        return v.remove(-1) ;
    }

    public Object sommet() throws PileVideException {
        if(this.estVide())
            throw new PileVideException();
        return v.lastElement();
    }

    public int taille() {
        // à compléter
        return v.size();
    }

    public int capacite() {
        // à compléter
        return v.size();
    }

    public boolean estVide() {
        // à compléter
        return v.isEmpty();
    }

    public boolean estPleine() {
        // à compléter
        return true;
    }

    public String toString() {
        // à compléter
        return v.toString();
    }

    public boolean equals(Object o) {
        if(o instanceof Pile3){
            Pile3 p = (Pile3) o;
            if(v.equals(p))
                return true;
        }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
