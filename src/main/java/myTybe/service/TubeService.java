package myTybe.service;

import myTybe.domain.models.server.TubeServiceModel;

public interface TubeService {

    void saveTube(TubeServiceModel tubeServiceModel);

    TubeServiceModel findByName(String name);
}
