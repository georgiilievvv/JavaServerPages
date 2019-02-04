package myTybe.web.servlets;

import myTybe.domain.models.view.TubeDetailsViewModel;
import myTybe.service.TubeService;
import myTybe.util.ModelMapper;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/tubes/details")
public class TubeDetailsServlet extends HttpServlet {

    private final TubeService tubeService;
    private final ModelMapper modelMapper;

    @Inject
    public TubeDetailsServlet(TubeService tubeService, ModelMapper modelMapper) {
        this.tubeService = tubeService;
        this.modelMapper = modelMapper;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String decodedName = URLDecoder.decode(
                req.getQueryString().split("=")[1], StandardCharsets.UTF_8);

        TubeDetailsViewModel tubeDetailsViewModel =this.modelMapper.map(
                this.tubeService.findByName(decodedName), TubeDetailsViewModel.class);

        req.setAttribute("tubeDetailsViewModel", tubeDetailsViewModel);

        req.getRequestDispatcher("/jsps/tube-details.jsp").forward(req, resp);
    }
}
