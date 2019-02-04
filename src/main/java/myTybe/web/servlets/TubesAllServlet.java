package myTybe.web.servlets;

import myTybe.domain.models.view.TubeAllViewModel;
import myTybe.service.TubeService;
import myTybe.util.ModelMapper;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet("/tubes/all")
public class TubesAllServlet extends HttpServlet {

    private final TubeService tubeService;
    private final ModelMapper modelMapper;

    @Inject
    public TubesAllServlet(TubeService tubeService, ModelMapper modelMapper) {
        this.tubeService = tubeService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("allTubes", this.tubeService.findAll()
                .stream()
                .map(e -> this.modelMapper.map(e, TubeAllViewModel.class))
                .collect(Collectors.toList()));

        req.getRequestDispatcher("/jsps/all-tubes.jsp").forward(req, resp);
    }
}
