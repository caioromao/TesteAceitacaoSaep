import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

public class StubRequisicoesSaepResolucoes {
	public void inicializarStubGet(){
		stubFor(get(urlEqualTo("/saep/resolucoes"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}

	private String criarJsonMokup(String tipoRequisicao) {
		String json = "";
		if (tipoRequisicao.equals("GET")) {
			json = "{"
					+ "'codigo': 123,"
					+ "'mensagem': erro desconhecido"
					+"}";
		}
					   
		return json;
	}
}
