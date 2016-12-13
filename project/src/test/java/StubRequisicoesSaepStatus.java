import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

public class StubRequisicoesSaepStatus {
	
	public void inicializarStubGet(){
		stubFor(get(urlEqualTo("/saep/status"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}

	private String criarJsonMokup(String tipoRequisicao) {
		String json = "";
		if (tipoRequisicao.equals("GET")) {
			json = "{"
					+ "'name': 'occaecat nostrud voluptate',"
					+ "'id': 510558454,"
					+ "'tag': 'uti pariatur'"
					+"}";
		}
					   
		return json;
	}

}
