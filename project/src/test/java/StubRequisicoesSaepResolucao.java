import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

public class StubRequisicoesSaepResolucao {

	public void inicializarStubGet(){
		stubFor(get(urlEqualTo("/saep/resolucao/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("GET"))));
	}
	
	public void inicializarStubPost(){
		stubFor(post(urlMatching("/saep/resolucao/1"))
                .withHeader("Content-Type", equalTo("application/json"))
                .withRequestBody(equalToJson(criarJsonMokup("POST")))
                .willReturn(aResponse()
                        .withStatus(201)
                        .withHeader("Content-Type", "application/json")
                        .withBody(criarJsonMokup("POST"))));
	}
	
	public void inicializarStubDelete(){
		stubFor(delete(urlEqualTo("/saep/resolucao/1"))
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
