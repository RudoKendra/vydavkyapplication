package sk.rudokendra.vydavkyapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.rudokendra.vydavkyapplication.model.Vydavok;
import sk.rudokendra.vydavkyapplication.repository.VydavokRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VydavokService implements IVydavokService {
    @Autowired // vytvara object
    private VydavokRepository vydavokRepository;

    @Override
    public Vydavok ulozVydavok(Vydavok vydavokObjekt) {
        return vydavokRepository.save(vydavokObjekt);
    }

    @Override
    public Vydavok akalizujVydavok(Vydavok vydavokObjekt) {
        return vydavokRepository.save(vydavokObjekt);
    }

    @Override
    public List<Vydavok> zobrazVsetkyVydavky() {
        return vydavokRepository.findAll();
    }

    @Override
    public Vydavok ziskajVydavokPodlaId(long id) {
        return vydavokRepository.findById(id).get();
    }

    @Override
    public void ostranVydavok(long id) {
        vydavokRepository.deleteById(id);
    }

//    @Override
//    public Vydavok hladajVydavokPodlaID(long id) {
//        Optional<Vydavok> optional = vydavokRepository.findById(id);
//        Vydavok vydavok = null;
//        if (optional.isPresent()) {
//            vydavok = optional.get();
//        } else {
//            throw new RuntimeException("Vydavok neexistuje: " + id);
//        }
//        return vydavok;
//    }

}
