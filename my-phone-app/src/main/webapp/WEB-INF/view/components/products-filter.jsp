<form action="/produkty" method="get">
    <c:forEach items="${brands}" var="brand">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" name="marka" value="${brand}"
                ${checkedBrands.contains(brand) ? "checked" : ""}    >
            <label class="form-check-label">
                    ${brand}
            </label>
        </div>
    </c:forEach>
    <button type="submit" class="btn btn-default">Filtruj</button>
</form>
