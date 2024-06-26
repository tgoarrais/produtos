package br.com.meva.service;

import br.com.meva.model.Produto;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

import java.math.BigDecimal;

public class TraduzProdutoService {
    public void traduzir(Produto produto) {
        String novoNome = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName());
        String novaDescricao = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription());

        produto.setName(novoNome);
        produto.setDescription(novaDescricao);

    }

}
