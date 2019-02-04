package myTybe.web.servlets;

import myTybe.domain.models.binding.TubeCreateBindingModel;
import myTybe.domain.models.server.TubeServiceModel;
import myTybe.service.TubeService;
import myTybe.util.ModelMapper;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tubes/create")
public class TubeCreateServlet extends HttpServlet {

    private final ModelMapper modelMapper;
    private final TubeService tubeService;

    @Inject
    public TubeCreateServlet(ModelMapper modelMapper, TubeService tubeService) {
        this.modelMapper = modelMapper;
        this.tubeService = tubeService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsps/tube-create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        TubeCreateBindingModel tubeCreateBindingModel = (TubeCreateBindingModel)
                req.getAttribute("tubeBindingModel");

        this.tubeService.saveTube(this.modelMapper
                .map(tubeCreateBindingModel, TubeServiceModel.class));

        resp.sendRedirect("/tubes/details?name=" + tubeCreateBindingModel.getName());
    }
}
