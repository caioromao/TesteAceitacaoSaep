import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.*;


public class StubRequisicoesSaepParecer {
	public void inicializarStubGet(){
		stubFor(get(urlEqualTo("/saep/parecer/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}
	
	public void inicializarStubPost(){
		stubFor(post(urlMatching("/saep/parecer/1"))
                .withHeader("Content-Type", equalTo("application/json"))
                .withRequestBody(equalToJson(criarJsonMokup("POST")))
                .willReturn(aResponse()
                        .withStatus(201)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("POST"))));
	}
	
	public void inicializarStubDelete(){
		stubFor(delete(urlEqualTo("/saep/parecer/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}
	
	private String criarJsonMokup(String tipoRequisicao) {
		String json = "";
		if (tipoRequisicao.equals("GET")) {
			json = "{"
					+ "'codigo': 82432638,"
					+ "'mensagem': 'velit  nisi aute pariatur adipiscing'"
					+"}";
		}else if (tipoRequisicao.equals("POST")) {
			json = "{"
					+ "'codigo': 47541330,"
					+ "'mensagem': 'consectetur'"
					+"}";
		}else if (tipoRequisicao.equals("DELETE")) {
			json = "{"
					+ "'codigo': 27815930,"
					+ "'mensagem': 'aliqua'"
					+"}";
		}
					   
		return json;
	}
}
