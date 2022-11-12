package br.fepi.ads.qatar.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.ads.qatar.domain.Selecao;
import br.fepi.ads.qatar.selecao_repository.SelecaoRepositorio;


@RestController
@RequestMapping(value = "/selecao")
public class SelecaoResources {
    @Autowired
    private SelecaoRepositorio selecao_repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Selecao> listar(){

        return selecao_repository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Selecao buscaId(@PathVariable("id")Long id){
        return selecao_repository.findById(id).orElse(null);
    }
    
    @RequestMapping(method = RequestMethod.POST)
	public void inserir(@RequestBody Selecao selecao) {

		selecao_repository.save(selecao);

	}

    @RequestMapping(value ="{id}", method= RequestMethod.DELETE)
    public void deletar(@RequestBody Long id){

        selecao_repository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method= RequestMethod.PUT)
    public void alterar(@RequestBody Selecao selecao, @PathVariable("id")Long id){

        selecao.setId(id);
        selecao_repository.save(selecao);

    }

    
    
}
