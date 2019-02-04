package myTybe.service;

import myTybe.domain.entities.Tube;
import myTybe.domain.models.server.TubeServiceModel;
import myTybe.repository.TubeRepository;
import org.modelmapper.ModelMapper;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class TubeServiceImpl implements TubeService{

    private final TubeRepository tubeRepository;
    private final ModelMapper modelMapper;

    @Inject
    public TubeServiceImpl(TubeRepository tubeRepository, ModelMapper modelMapper) {
        this.tubeRepository = tubeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void saveTube(TubeServiceModel tubeServiceModel) {

        this.tubeRepository.save(this.modelMapper.map(tubeServiceModel, Tube.class));
    }

    @Override
    public TubeServiceModel findByName(String name) {
        Tube tube = this.tubeRepository.findByName(name).orElse(null);

        return this.modelMapper.map(tube, TubeServiceModel.class);
    }

    @Override
    public List<TubeServiceModel> findAll() {
        return this.tubeRepository.allEntities().stream().map(e ->
                this.modelMapper.map(e, TubeServiceModel.class))
                .collect(Collectors.toList());
    }
}
