package sk.rudokendra.vydavkyapplication.service;

import sk.rudokendra.vydavkyapplication.model.Vydavok;

import java.util.List;

public interface IVydavokService {
    Vydavok ulozVydavok (Vydavok vydavokObjekt);
    Vydavok akalizujVydavok (Vydavok vydavokObjekt);
    List<Vydavok> zobrazVsetkyVydavky();
    Vydavok ziskajVydavokPodlaId (long id);
    void ostranVydavok (long id);
}
