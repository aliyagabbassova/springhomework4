package ru.geekbrains.springhomework4.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.springhomework4.model.Citizens;
import ru.geekbrains.springhomework4.controllers.CitizensController;

import java.util.ArrayList;
import java.util.List;
@Service
public class CitizensService {
    private List<Citizens> citizens = new ArrayList<>();

    public void addCitizens(Citizens p){citizens.add(p);}

    public List<Citizens> findAll(){return  citizens;}
}
