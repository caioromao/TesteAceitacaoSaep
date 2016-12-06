import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class StepProducaoIntelectualCientifica {

    private String artigoQualis;
    private String artigoSemQualis;
    private int artigoCompleto;

    @Step("Informar artigo qualis <artigoQualis>.")
    public void setArtigoQualis(String artigoQualis) {
        this.artigoQualis = artigoQualis;
    }

    @Step("Informar artigo sem qualis <artigoSemQualis>.")
    public void setArtigoSemQualis(String artigoSemQualis) {
        this.artigoSemQualis = artigoSemQualis;
    }

    @Step("Calcular artigo completo.")
    public void calcularArtigoCompleto() {
        if (!artigoQualis.equals("")) {
            artigoCompleto = artigoCompleto + 20;
        }

        if (!artigoSemQualis.equals("")) {
            artigoCompleto = artigoCompleto + 10;
        }

        Assert.assertEquals(30, artigoCompleto);
    }


    @Step("Informar periodicos especializados <periodicosEspecializados>.")
    public void setPeriodicosEspecializados(String periodicosEspecializados) {

    }

    @Step("Informar textos Literarios <textoLiterario>")
    public void setTextosLiterarios(String textoLiterario) {

    }

    @Step("Calcular Pontuacao textos literarios <pontuacaoMaxima>.")
    public void calcularPontuacaoTextosLiterarios(int pontuacaoMaxima) {

    }

    @Step("Informar resumo expedito internacional <resumo>.")
    public void setResumoInternacional(String resumo) {

    }

    @Step("Informar resumo expedito nacional <resumo>.")
    public void setResumoNacional(String resumo) {

    }

    @Step("informar resumo expedito regional <resumo>.")
    public void setResumoRegional(String resumo) {

    }

    @Step("calcular somatorio dos resumos <pontuacaoMaxima>.")
    public void calcularSomatoriaDoResumos(int pontuacaoMaxima) {

    }

    @Step("Informar simples internacional <simples>.")
    public void setSimplesInternacional(String simples) {

    }

    @Step("Informar simples nacional <simples>.")
    public void setSimplesNacional(String simples) {

    }

    @Step("informar simples regional <simples>.")
    public void setSimplesRegional(String simples) {

    }

    @Step("calcular somatorio dos resumos simples <pontuacaoMaxima>.")
    public void calcularSomatorioSimples(int pontuacaoMaxima) {

    }

    @Step("Informar trabalho completo publicado em anais de congresso cientifico <trabalho>.")
    public void setTrabalhoCompletoPublicadoAnaisComgressoCientifica(String trabalho) {

    }

    @Step("Informar editor de livro publicado <editor>.")
    public void setEditorLivroPublicado(String editor) {

    }

    @Step("Informar livro publicado com corpo da editora <livro>.")
    public void setLivroPublicadoComCorpoEditora(String livro) {

    }

    @Step("Informar livro sem selo editora <livro>.")
    public void setLivroSemSeloEditora(String livro) {

    }

    @Step("Informar capitulo do livro publicado com corpo da editora <livro>.")
    public void setCapituloLivroPublicadoComCorpoEditora(String livro) {

    }

    @Step("Calular pontuacao capitulo do livro publicado com corpo da editora <Pontuacao Maxima>")
    public void caucularPontuacaoLivroPublicadoComCorpoEditora(int pontutuacao) {

    }

    @Step("Informar edicao do livro publicado com corpo editora <edicao>.")
    public void setEdicaoLivroPublicadoComCorpoEditora(String edicao) {

    }

    @Step("Informar capitulo traduzido de livro com corpo da editora <capitulo>.")
    public void setCapituloTraduziadoLivroComCorpoEditora(String capitulo) {

    }

    @Step("Calcular pontuacao capitulo traduzido de livro com corpo da editora <pontuacaoMaxima>.")
    public void calcularPontuacaoCapituloTraduzidoComCorpoEditora(String pontuacaoMaxima) {

    }

    @Step("Informar traducao ou revisao cientifica <revisaoCientifica>.")
    public void setTraducaoCientifica(String revisaoCientifica) {

    }

    @Step("Informar resenhas prefacio ou verbetes <prefacios>.")
    public void setPrefacios(String prefacios) {

    }

    @Step("Informar livro didatico para projetos institucionais <livro>.")
    public void setLivroDidaticosProjetoInstitucionais(String livro) {

    }

    @Step("Informar editor de periodicos, especializados indexados com corpo editorial <editor>.")
    public void setEditorPeriodicos(String editor) {

    }

    @Step("Informar editor de jornais ou revistas com distribuicao local ou regional <editor>.")
    public void setEditorDistribuicaoLocal(String editor) {

    }

    @Step("Informar editor de jornais ou revistas com distribuicao nacional <editor>.")
    public void setEditorDistribuicaoNacional(String editor) {

    }

    @Step("Informar editor de jornais ou revistas com distribuicao internacional <editor>.")
    public void setEditorInternacional(String editor) {

    }

    @Step("Calcular pontuacao de jornais e revistas.")
    public void calcularPontuacaoJornaisOuRevistas() {

    }

    @Step("Informar disertacao mestrado defendica e aprovada <disertacao>.")
    public void setDisertacaoMestrado(String disertacao) {

    }

    @Step("Informar tese de doutorado defendia e aprovada <tese>.")
    public void setTeseDoutorado(String tese) {

    }

    @Step("Calcular soma de todas as producaoes cientificas.")
    public void calcularSomaDeTodasProducaoesCientificas() {

    }
}
