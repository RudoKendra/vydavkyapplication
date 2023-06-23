package sk.rudokendra.vydavkyapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.rudokendra.vydavkyapplication.model.Vydavok;
import sk.rudokendra.vydavkyapplication.repository.VydavokRepository;

import java.util.List;

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

}
