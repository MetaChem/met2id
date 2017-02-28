package function;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

import javax.xml.ws.Holder;

public class runPathway {

    public static void main(String[] args) {
        Impala service = new Impala();
        ImpalaPortType port = service.getImpalaPort();

        //service.getPort(serviceEndpointInterface)

        PathwayORAmetabolitesResponse pathwayORAmetabolitesResponse = new PathwayORAmetabolitesResponse();
        pathwayORAmetabolitesResponse.getAllMetabolitesNum();

        //PathwayORAmetabolites pathwayORAmetabolites = new PathwayORAmetabolites();

        String metaboliteAccType = "kegg";
        List<String> metaboliteAccFg = new ArrayList<String>();
        metaboliteAccFg.add("C00002");
        metaboliteAccFg.add("C00011");

        List<String> metaboliteAccBg = new ArrayList<String>();

        Holder<List<String>> pathwayName = null;
        Holder<List<String>> pathwaySource = null;
        Holder<List<Integer>> overlappingMetabolitesNum = null;
        Holder<List<String>> overlappingMetabolites = null;
        Holder<List<String>> allMetabolitesNum = null;
        Holder<List<String>> pMetabolites = null;
        Holder<List<String>> qMetabolites = null;


        port.pathwayORAmetabolites(metaboliteAccType, metaboliteAccFg, metaboliteAccBg, pathwayName, pathwaySource, overlappingMetabolitesNum, overlappingMetabolites, allMetabolitesNum, pMetabolites, qMetabolites);


        //System.out.println(payerList);


    }

}
