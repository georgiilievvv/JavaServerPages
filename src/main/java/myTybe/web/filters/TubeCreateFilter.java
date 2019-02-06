package myTybe.web.filters;

import myTybe.domain.models.binding.TubeCreateBindingModel;
import myTybe.domain.models.server.TubeServiceModel;
import myTybe.util.ValidatorUtil;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/tubes/create")
public class TubeCreateFilter implements Filter {

    private final ValidatorUtil validator;

    @Inject
    public TubeCreateFilter(ValidatorUtil validator) {
        this.validator = validator;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (req.getMethod().equalsIgnoreCase("post")){
            TubeCreateBindingModel tubeCreateBindingModel = new TubeCreateBindingModel();

            tubeCreateBindingModel.setName(req.getParameter("name"));
            tubeCreateBindingModel.setDescription(req.getParameter("description"));
            tubeCreateBindingModel.setYouTubeLink(req.getParameter("link"));
            tubeCreateBindingModel.setUploader(req.getParameter("uploader"));

            if (!this.validator.isValid(tubeCreateBindingModel)) {

                resp.sendRedirect("/jsps/error-page.jsp");

                chain.doFilter(req,resp);
                return;
            }

            req.setAttribute("tubeBindingModel", tubeCreateBindingModel);
        }

        chain.doFilter(req,resp);
    }
}