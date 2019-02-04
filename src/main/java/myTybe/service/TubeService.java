package myTybe.service;

import myTybe.domain.models.server.TubeServiceModel;

import java.util.List;

public interface TubeService {

    void saveTube(TubeServiceModel tubeServiceModel);

    TubeServiceModel findByName(String name);

    List<TubeServiceModel> findAll();
}
