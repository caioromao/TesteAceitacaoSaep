import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

public class StubRequisicoesSaepRadoc {
	public void inicializarStubGet(){
		stubFor(get(urlEqualTo("/saep/radoc/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}
	
	public void inicializarStubPost(){
		stubFor(post(urlMatching("/saep/radoc/1"))
                .withHeader("Content-Type", equalTo("application/json"))
                .withRequestBody(equalToJson(criarJsonMokup("POST")))
                .willReturn(aResponse()
                        .withStatus(201)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("POST"))));
	}
	
	public void inicializarStubDelete(){
		stubFor(delete(urlEqualTo("/saep/radoc/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}
	
	private String criarJsonMokup(String tipoRequisicao) {
		String json = "";
		if (tipoRequisicao.equals("GET")) {
			json = "{"
					+ "'codigo': 19418170,"
					+ "'mensagem': 'aute'"
					+"}";
		}else if (tipoRequisicao.equals("POST")) {
			json = "{"
					+ "'codigo': 9471169,"
					+ "'mensagem': 'adipisicing'"
					+"}";
		}else if (tipoRequisicao.equals("DELETE")) {
			json = "{"
					+ "'codigo': -42948375,"
					+ "'mensagem': 'consequant consectetur'"
					+"}";
		}
					   
		return json;
	}
}
