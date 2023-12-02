/** @format */

// SummonerListPage.js

import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./SummonerListPage.css";

const SummonerListPage = () => {
  const [summoners, setSummoners] = useState([
    { id: 1, name: "Summoner1" },
    { id: 2, name: "Summoner2" },
    // ... 더 많은 소환사 데이터
  ]);

  const navigate = useNavigate();

  const handleSummonerClick = (summonerId) => {
    navigate(`/search-result/${summonerId}`);
  };

  return (
    <div className='summoner-list-container'>
      <h2>소환사 리스트</h2>
      <ul>
        {summoners.map((summoner) => (
          <li
            key={summoner.id}
            onClick={() => handleSummonerClick(summoner.id)}
          >
            {summoner.name}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default SummonerListPage;
