import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;


public class StubsRequisicoesSaepAlteracoes {
	public void inicializarStubGet(){
		stubFor(get(urlEqualTo("/saep/resolucoes/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}
	
	private String criarJsonMokup(String tipoRequisicao) {
		String json = 	"{"
						+ "'codigo': -54100577,"
						+ "'mensagem': 'in'"
						+"}";
		
		return json;
	}
}
