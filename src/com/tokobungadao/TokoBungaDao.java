package com.tokobungadao;

import java.util.List;

import com.tokobungamodel.TokoBunga;

public interface TokoBungaDao {
    public void save(TokoBunga tokoBunga);

    public void update(TokoBunga tokoBunga);

    public void delete(TokoBunga tokoBunga);

    public TokoBunga get(String kd_bunga);

    public List<TokoBunga> getList();
}
